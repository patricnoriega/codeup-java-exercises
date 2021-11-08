public class Exceptions {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        try {
//
//
//            throw new Exception("hey something went wrong");
//        } catch (Exception e){
//            e.printStackTrace();
//
//        }
//        a deeper example with try catch
//        try {
//            System.out.println("Let me see if i can divide by zero");
//            int result = 1 / 0;
//            System.out.println("I did it math is mine");
//        }catch (ArithmeticException e){
//            e.printStackTrace();
//        }

//        an even deeper example with try catch

//        try {
//            throw new Exception("Something went wrong \n Error \n Error \n");
//            throw new RuntimeException("Runtime Exception check the stack trace for details");
//            String nullStr = null;
//            System.out.println(nullStr.toLowerCase());
//        } catch (NullPointerException e){
//            e.printStackTrace();
//            e.getMessage();
//        } catch (RuntimeException e){
//            System.out.println("This runtime fired!");
//            e.printStackTrace();
//            e.getMessage();
//        } catch (Exception e){
//            System.out.println("generic Exception fired!");
//            e.printStackTrace();
//            e.getMessage();
//        } finally {
//            System.out.println("This will always run");
//        }

//        Final example
        try {
            String[] days = {"Monday", "Tuesday"};
            System.out.println(days[2]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Most specific");
            e.printStackTrace();
            e.getMessage();
        }catch (RuntimeException e){
            System.out.println("Sorta specific");
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("Least specific");
        }
    }
}

//    public double getDouble() throws NumberFormatException {
//        try {
//            return Double.valueOf(getString());
//        } catch (NumberFormatException e) {
//            System.out.println("Number Format Exception: User did not enter a required decimal number.");
//            e.printStackTrace();
//            return getDouble();
//        }
//    }
//
//    public double getDouble(String prompt) {
//        System.out.println(prompt);
//        return getDouble();
//    }
//
//    public int getInt() throws NumberFormatException {
//        try {
//            return Integer.valueOf(getString());
//        } catch (NumberFormatException e) {
//            System.out.println("Number Format Exception: User did not enter an integer.");
//            return getInt("Solve by: entering a WHOLE NUMBER.");
//        }
//    }
//
//    public int getInt(String prompt) {
//        System.out.println(prompt);
//        return getInt();
//    }

//    public String getString(String prompt) {
//        System.out.println(prompt);
//        return getString();
//    }