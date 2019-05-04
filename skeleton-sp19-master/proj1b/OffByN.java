public class OffByN  implements CharacterComparator{
    private int x;
    public OffByN(int x){
        this.x=x;
    }
    @Override
    public boolean equalChars(char x, char y) {
        return Math.abs(x-y)==this.x;
    }
}
