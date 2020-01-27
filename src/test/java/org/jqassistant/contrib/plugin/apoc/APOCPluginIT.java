package org.jqassistant.contrib.plugin.apoc;

import com.buschmais.jqassistant.plugin.common.test.AbstractPluginIT;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class APOCPluginIT extends AbstractPluginIT {

    @Test
    public void help() {
        assertThat(query("call apoc.help('search')").getRows().isEmpty()).isFalse();
    }

}
