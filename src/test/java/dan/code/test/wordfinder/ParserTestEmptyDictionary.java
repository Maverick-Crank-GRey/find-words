package dan.code.test.wordfinder;

import com.google.common.collect.ImmutableSet;
import dan.code.test.wordfinder.Parser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Set;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.collection.IsEmptyCollection.empty;

/**
 * Created by maverick on 7/7/14.
 */
public class ParserTestEmptyDictionary {

    private Parser parser;

    @Before
    public void setUp() throws Exception {
        parser = new Parser(ImmutableSet.<String>of());
    }

    @Test
    public void testParse_emptyLine() throws Exception {
        final Set<List<String>> lines = parser.parse("");

        Assert.assertThat(lines, is(empty()));
    }

    @Test
    public void testParse_shortLine() throws Exception {
        final Set<List<String>> lines = parser.parse("word");

        Assert.assertThat(lines, is(empty()));
    }
}
