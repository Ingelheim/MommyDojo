import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by lingelhe on 29/01/2014.
 */

public class StringReplaceTest {

    private Mommy mommy;

    @Before
    public void setUp() throws Exception {
        mommy = new Mommy();
    }

    @Test
    public void shouldNotMommifyEmptyString() throws Exception {
        assertThat(mommy.mommify(""),is(""));
    }

    @Test
    public void shouldMommifyVowels() throws Exception {
        assertThat(mommy.mommify("a"),is("mommy"));
        assertThat(mommy.mommify("e"),is("mommy"));
        assertThat(mommy.mommify("i"),is("mommy"));
        assertThat(mommy.mommify("o"),is("mommy"));
        assertThat(mommy.mommify("u"),is("mommy"));

        assertThat(mommy.mommify("A"),is("mommy"));
        assertThat(mommy.mommify("E"),is("mommy"));
        assertThat(mommy.mommify("I"),is("mommy"));
        assertThat(mommy.mommify("O"),is("mommy"));
        assertThat(mommy.mommify("U"),is("mommy"));
    }

    @Test
    public void shouldNotMommifyConsonants() throws Exception {
        assertThat(mommy.mommify("X"),is("X"));
    }

    @Test
    public void shouldMommifyHis() throws Exception {
        assertThat(mommy.mommify("his"),is("hmommys"));
    }

    @Test
    public void shouldMommifyHisi() throws Exception {
        assertThat(mommy.mommify("hisi"),is("hmommysmommy"));
    }

    @Test
    public void shouldNotMommifyDDOS() throws Exception {
        assertThat(mommy.mommify("DDOS"),is("DDOS"));
    }

    @Test
    public void shoulMommifyHearTheRightWay() throws Exception {
        assertThat(mommy.mommify("hear"),is("hmommyr"));
    }

    @Test
    public void shoukdMommifyALongString() throws Exception {
        assertThat(mommy.mommify("heeeeeeaaaaaaar"),is("hmommyr"));
    }
}