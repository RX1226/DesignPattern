package Adapter.Pattern;

public class ClassAdapter extends Source implements Target{
    @Override
    public void request() {
        sourceRequest();
    }
}
