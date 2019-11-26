class Database {
    private int readers;

    public Database() {
        this.readers = 0;
    }

    void read(final int reader_number) {
        synchronized (this) {
            this.readers++;
            System.out.println("Reader " + reader_number + " Starts Reading");
        }

        final int delay = 5000;

        try {
            Thread.sleep((int) Math.random() * delay);

        } catch (final InterruptedException ignored) {
        }

        synchronized (this) {
            System.out.println("Reader " + reader_number + "Stops Reading");
            this.readers--;
            if (this.readers == 0) {
                this.notifyAll();
            }
        }
    }

    synchronized void write(final int writerNo) {
        while (this.readers != 0) {
            try {
                this.wait();
            } catch (final InterruptedException ignored) {
            }
            System.out.println("Writer " + writerNo + " Starts writing");

            final int delay = 5000;

            try {
                Thread.sleep((int) Math.random() * delay);
            } catch (final InterruptedException ignored) {

            }

            System.out.println("Writer " + writerNo + " Stops writing");
            this.notifyAll();
        }
    }
}

class Reader extends Thread {
    static int readers = 0;

    private final int number;
    private final Database db;

    Reader(final Database db) {
        this.db = db;
        this.number = readers++;
    }

    public void run() {
        while (true) {
            final int delay = 5000;
            try {
                Thread.sleep((int) Math.random() * delay);
            } catch (final InterruptedException ignored) {
                // TODO: handle exception
            }  

            this.db.read(this.number);
        }
    }
}

class Writer extends Thread {
    static int writer = 0;

    private final int number;
    private final Database db;

    Writer(final Database db) {
        this.db = db;
        this.number = writer++;
    }

    public void run() {
        while (true) {
            final int delay = 5000;
            try {
                Thread.sleep((int) Math.random() * delay);
            } catch (final InterruptedException ignored) {
                // TODO: handle exception
            }

            this.db.write(this.number);
        }
    }
}

/**
 * Extra_problems
 */
public class ReaderWriter {

    public static void main(final String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java ReaderWriter <number of readers> <number of writers>");
        } else {
            final int READERS = Integer.parseInt(args[0]);
            final int WRITERS = Integer.parseInt(args[1]);
            final Database database = new Database();
            for (int i = 0; i < WRITERS; i++) {
                new Writer(database).start();
            }
            for (int i = 0; i < READERS; i++) {
                new Reader(database).start();
            }

            // try {
            //     Thread.currentThread().join();
            // } catch (InterruptedException e) {
            //     // TODO Auto-generated catch block
            //     e.printStackTrace();
            // }
    }
    }
}