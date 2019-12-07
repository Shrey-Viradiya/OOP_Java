import java.util.*;

class Fork
{
    String name;
    boolean busy = false;
    Fork(String name) {
        this.name = name;
    }

    synchronized public void pickUp() {
        while(this.busy) {
            try {
                wait();
            }
            catch (Exception e) {}
        }
        this.busy = true;
        System.out.println("Picking up Fork: " + this.name);
    }

    synchronized public void putDown() {
        this.busy = false;
        notifyAll();
        System.out.println("Putting down Fork: " + this.name);
    }
}

class Spagetti
{
    Fork f0, f1;
    Spagetti(Fork f0, Fork f1) {
        this.f0 = f0;
        this.f1 = f1;
    }

    public void eat(String name) {

        // Phelosopher Tries to pickup first fork
        this.f0.pickUp();

        // If second fork is busy then he puts down the first fork
        if(f1.busy == true){
            f0.putDown();
            return;
        }

        // Phelosopher Tries to pickUp second fork
        this.f1.pickUp();

        System.out.println("\n" + name + " eating spagetti!\n");
        try {
            Thread.sleep((int)(5000* (Math.random()))); // eat for random time, maximum 5 seconds
        }
        catch (Exception e) {}
        System.out.println("\n" + name + " finished eating spagetti!\n");

        // Phelosopher puts down both forks
        this.f0.putDown();
        this.f1.putDown();
    }
}

class Philosopher implements Runnable
{
    String name;
    Spagetti food;
    Philosopher(Fork f0, Fork f1, String name) {
        this.name = name;
        this.food = new Spagetti(f0, f1);
    }

    public void run() {
      // Thinks For Some Time
        while(true) {
            try {
                Thread.sleep((int)(1000*(1 + Math.random())));
            }
            catch (Exception e) {}

        // Eats Spagetti
            food.eat(this.name);
        }
    }
}

class Table
{
    Fork[] forks;
    Philosopher[] philosophers;

    Table() {
        this.forks = new Fork[5];

        for(int i=0;i<5;i++) {
            this.forks[i] = new Fork("f"+i);
        }

        this.philosophers = new Philosopher[5];

        for(int i=0;i<5;i++) {
            this.philosophers[i] = new Philosopher(this.forks[i], this.forks[(i+1)%5], "Phelosopher "+i+ " ");
            new Thread(this.philosophers[i]).start();
        }
    }
}



class DinningPhelo
{
    public static void main(String[] args) {
        System.out.println("Dinning Phelosophers Problem");
        new Table();
    }
}
