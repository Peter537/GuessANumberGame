public class MainFeature {

    public MainFeature() {
        NewFeature newFeature = new NewFeature();
        System.out.println(newFeature);
    }

    @Override
    public String toString() {
        return "this is a main feature";
    }
}