import java.util.HashMap

public class WordFrequency
{
    public static void main(string args[])
    {
    System.out.printf("Program Starting...%n");
    String filename = args[0];
    if(!filename)
    {
        System.err.printf("No File Entered%n");
        System.exit(1);
    }
    try{
        string newWord = "";
        HashMap<String, Integer> words = new HashMap<>();
        FileReader inputText = new FileReader(inputText);
        BufferedReader reader = new BufferedReader(inputText);
        while( newWord = reader.readLine() != null)
        {
            if(!words.constainsKey(newWord))
                words.put(newWord, 1);
            else
                words.put(newWord, words.get(newWord)+1);
        }
        reader.close();

        Collection<string> values = words.values(); // Debug Only

        for(String value : values)
            System.out.println(value);

        ArrayList<Entry<String,Integer>> copy = new ArrayList<>();
        copy.addAll(hash.entrySet());
        copy.sort()
    }
    catch(Exception e){
        System.err.printf("Exception: %s%nProgram Closing%n");
        System.exit(1);
    }


    }

}
