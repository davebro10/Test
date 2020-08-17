import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

class HelloWorldApp {
    public static void main(String[] args) {

        String filepath = "";

        Test t = new Test();
        filepath = t.GetOutput();

        try
        {
            String x = readFile(filepath);
            System.out.println("Hello World!");
        } catch (Exception e)
        {
            System.out.println("Error");
        }
    }

    public static String readFile(String path) throws IOException
    {
        File file = new File(path);
        byte[] encoded = Files.readAllBytes((file.toPath()));
        return "";
    }
}

class Test
{
    public Test() {}

    public String GetOutput()
    {
        return "C:test/input.txt";
    }
}

