public class Poem {
    public String PoemName;
    public int Lines;

    public Poem(String name, int NumLines){
        PoemName = name;
        Lines = NumLines;
    }

    public int getLines() {
        return Lines;
    }

    public String getPoemName() {
        return PoemName;
    }

}
