public class InstanceCounter {
    
    private static int instanceCount = 0;

    public InstanceCounter() {
       
        instanceCount++;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            InstanceCounter instances = new InstanceCounter();
        }

       
        System.out.println("Number of instances created: " + InstanceCounter.getInstanceCount());
    }
}
