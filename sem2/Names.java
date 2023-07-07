import AllAvengers.Human;

public enum Names {

    IronMan("Tony Stark"), Thor("Thor Odinson"), Hulk("Bruce Banner"), Wasp("Janet Van Dyne"), Human("Human"),
    AntMan("Dr.Henry Jonathan Pym"), CaptainAmerica("Steven Rogers"), BlackWidow("Natasha Romanoff"), SpiderMan("Peter Parker");

    private String name;

    Names(String name) {this.name = name;}

    public String getName() {return name;}
}
