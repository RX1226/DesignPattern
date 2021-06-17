package Adapter.Pattern;

public class ObjectAdapter implements Target{
    private Source source;
    public ObjectAdapter(Source source){
        this.source = source;
    }
    @Override
    public void request() {
        source.sourceRequest();
    }
}
