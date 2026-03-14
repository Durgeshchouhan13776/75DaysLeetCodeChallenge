class MyCircularQueue {
    int f;
    int r;
    int size;
    int[] arr;
    public MyCircularQueue(int k) {
        arr = new int[k];
        f = r = -1;
        size = k;
    }
    public boolean enQueue(int value) {
        if (isFull()) return false;

        if (isEmpty()) {
            f = r = 0;
        } else {
            r = (r + 1) % size;
        }

        arr[r] = value;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) return false;

        if (f == r) {
            f = r = -1;
        } else {
            f = (f + 1) % size;
        }

        return true;
    }

    public int Front() {
        if (isEmpty()) return -1;
        return arr[f];
    }

    public int Rear() {
        if (isEmpty()) return -1;
        return arr[r];
    }

    public boolean isEmpty() {
        return f == -1;
    }

    public boolean isFull() {
        return (r + 1) % size == f;
    }
}