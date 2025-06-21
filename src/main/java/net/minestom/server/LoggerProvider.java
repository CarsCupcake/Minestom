package net.minestom.server;

import net.kyori.adventure.text.logger.slf4j.ComponentLogger;

public interface LoggerProvider {
    ComponentLogger getLogger(Class<?> clazz);
}
