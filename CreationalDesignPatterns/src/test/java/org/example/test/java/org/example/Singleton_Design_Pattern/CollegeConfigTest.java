package org.example.Singleton_Design_Pattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CollegeConfigTest {

    @Test
    void testOnlyOneInstanceExists() {
        CollegeConfig config1 = CollegeConfig.getInstance();
        CollegeConfig config2 = CollegeConfig.getInstance();

        assertSame(config1, config2);
    }

    @Test
    void testCollegeName() {
        CollegeConfig config = CollegeConfig.getInstance();

        assertEquals("ABC College", config.getCollegeName());
    }

    @Test
    void testSystemVersion() {
        CollegeConfig config = CollegeConfig.getInstance();

        assertEquals("1.0", config.getSystemVersion());
    }

    @Test
    void testInstanceNotNull() {
        CollegeConfig config = CollegeConfig.getInstance();

        assertNotNull(config);
    }
}