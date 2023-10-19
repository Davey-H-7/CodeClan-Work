public class Printer {

    private int paper = 50;
    private int toner = 50;


    public int reducePaper(int value){
        this.paper = this.paper - value;
        return this.paper;
    }

    public int reduceToner(int pages){
        this.toner = this.toner - pages;
        return this.toner;
    }
    public void print(int pages, int copies){
        if(this.paper >= (pages * copies)){
            reducePaper(pages*copies);
            reduceToner(pages);
        }
    }
}
