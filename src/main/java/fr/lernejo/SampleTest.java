package fr.lernejo;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class SampleTest {

    @Test
    void op_ADD() {
        final Sample sample = new Sample();
        int result = sample.op(Sample.Operation.ADD,5,5);
        Assertions.assertThat(result).as("5+5").isEqualTo(10);

    }
    @Test
    void op_MULT() {
        final Sample sample = new Sample();
        int result = sample.op(Sample.Operation.MULT,5,5);
        Assertions.assertThat(result).as("5*5").isEqualTo(25);

    }


    @Test
    void fact() {
        final Sample sample = new Sample();
        int result = sample.fact(5);
        Assertions.assertThat(result).as("fact(5)").isEqualTo(120);



    }

}
