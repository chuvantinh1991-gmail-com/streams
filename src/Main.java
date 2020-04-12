import java.io.*;
public class Main {

    public static void main(String[] args) {
        Sensor sensor1 = new Sensor("Spring");
        Sensor sensor2= new Sensor("Summer");
        Sensor sensor3 = new Sensor("Autumn");
        Sensor sensor4 = new Sensor("Winter");

        //System.out.print(sensor1.toString());

        // The name of the file to wirte and open.
        String fileName = "data.txt";

        writeData(sensor1, fileName);
        writeData(sensor2, fileName);
        writeData(sensor3, fileName);
        writeData(sensor4, fileName);

        readData(fileName);

    }

    private static void writeData( Sensor sensor, String fileName){
        try {
            // Assume default encoding.
            FileWriter fileWriter = new FileWriter(fileName);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(sensor.toString());
            bufferedWriter.newLine();
            bufferedWriter.write(sensor.toString());
            bufferedWriter.newLine();
            bufferedWriter.write(sensor.toString());
            bufferedWriter.newLine();
            bufferedWriter.write(sensor.toString());

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
