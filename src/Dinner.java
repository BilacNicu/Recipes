public class Dinner {
    private String _name;
    private double _price;
    private String _recipe;
    public Dinner(String name,double price, String recipe) {
        this._name = name;
        this._price = price;
        this._recipe = recipe;
    }
    public String toString()
    {
        return _name +" "+ _price +" RON "+ _recipe + " ";
    }
}
