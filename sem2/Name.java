public enum Name {

    IronMan("Tony Stark"), Thor("Thor Odinson"), Hulk("Bruce Banner"), Wasp("Janet Van Dyne"),
    AntMan("Dr.Henry Jonathan Pym"), CaptainAmerica("Steven Rogers"), BlackWidow("Natasha Romanoff"), SpiderMan("Peter Parker");

    private String name;

    Name(String name) {this.name = name;}

    public String getName() {return name;}
}
