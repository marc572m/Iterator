package FilEksempler;

public class CollectionofNames implements Container {
    public Person tabel[];

    public CollectionofNames(Person[] tabel) {
        this.tabel = tabel;
    }

    @Override
    public Iterator getIterator() {
        return new CollectionofNamesIterate();

    }

    private class CollectionofNamesIterate implements Iterator{
        int i;
        @Override
        public boolean hasNext() {
            if (i< tabel.length){
                return true;
            }
            return false;
        }
        @Override
        public Object next() {
            if(this.hasNext()){
                return tabel[i++];
            }
            return null;
        }
    }


}

