package com.devops;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * Tests unitaires
 * @author Hafdi Youssef
 */
public class AppTest {

    private App app;

    @Before
    public void init() {
        app = new App();
    }

    @Test
    public void testMessage() {
        assertEquals("Bonjour et bon courage dans votre projet en DevOps", app.getMessage());
    }

    @Test
    public void testEtudiant() {
        assertEquals("Hafdi Youssef", app.getEtudiant());
    }

    @Test
    public void testVersion() {
        assertNotNull(app.getVersion());
        assertTrue(app.getVersion().startsWith("1.0"));
    }

    @Test
    public void testAnnee() {
        assertEquals("2025/2026", app.getAnnee());
    }

    @Test
    public void testEcole() {
        assertEquals("EMSI Tanger", app.getEcole());
    }

    @Test
    public void testMessageContenu() {
        assertTrue(app.getMessage().contains("DevOps"));
        assertTrue(app.getMessage().contains("Bonjour"));
    }

    @Test
    public void testModule() {
        assertEquals("DevOps", app.getModule());
    }

    @Test
    public void testGroupe() {
        assertEquals("5IIR", app.getGroupe());
    }
}
