package com.jakewharton.sdkmanager.internal;

/** An indirection to {@link java.lang.System}. */
interface System {
  String env(String name);
  long nanoTime();
  String property(String key);
  String property(String key, String defaultValue);

  static final class Real implements System {
    @Override String env(String name) {
      return java.lang.System.getenv(name)
    }

    @Override long nanoTime() {
      return java.lang.System.nanoTime();
    }

    @Override String property(String key) {
      return java.lang.System.getProperty(key);
    }

    @Override String property(String key, String defaultValue) {
      return java.lang.System.getProperty(key, defaultValue);
    }
  }
}
