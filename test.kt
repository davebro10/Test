/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 * /
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

fun readFilee(path:String):String
{
    try
    {
        var file = File(path);
        var encoded = Files.readAllBytes((file.toPath()));
    } catch(e:IOException)
    {

    }
    return "";
}

fun main() {
        var filepath = "";

        var t = Test();
        filepath = t.GetOutput();

        try
        {
            var x = readFilee(filepath);
            println(x)
        } catch (e:Exception)
        {
            println("Hello, world!!!")
        }
}

class Test
{
    fun GetOutput() : String {
        return "C:test/input.txt";
    }
}