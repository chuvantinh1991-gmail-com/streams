import java.io.*;
public class Main {

    public static void main(String[] args) {
        // The name of the file to wirte and open.
                String fileName = "data.txt";

        Sensor sensor1 = new Sensor("Spring");
        Sensor sensor2 = new Sensor("Sommer");
        writeData(sensor1, sensor2,  fileName);

        readData(fileName);
    }

    private static void writeData( Sensor sensor1, Sensor sensor2, String fileName){
        try {
            // Assume default encoding.
            FileWriter fileWriter = new FileWriter(fileName);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(sensor1.toString());
            bufferedWriter.newLine();
            bufferedWriter.write(sensor2.toString());
            bufferedWriter.newLine();

            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                    "Error writing to file '"
                            + fileName + "'");
        }
    }

    private static void readData(String fileName){
        String line = null;
        try{
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ( (line = bufferedReader.readLine()) != null ){
                System.out.println(line);
            }
        }catch (IOException ex){
            System.out.println(
                    "Error writing to file '"
                            + fileName + "'");
        }
    }
}
