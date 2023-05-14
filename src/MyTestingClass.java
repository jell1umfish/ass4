import java.util.Objects;

class MyTestingClass {
    private String value;
    public MyTestingClass(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        int result = 0;
        for (char c : value.toCharArray()) {
            result += (int) c;
        }
        return result;
    }

    //compares the value variable of MyTestingClass if they equal
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyTestingClass that = (MyTestingClass) o;
        return Objects.equals(value, that.value);
    }
}