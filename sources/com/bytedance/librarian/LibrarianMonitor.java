package com.bytedance.librarian;

import com.bytedance.frameworks.apm.trace.MethodCollector;

public class LibrarianMonitor {
    public void a(String str) {
        MethodCollector.i(14174);
        System.loadLibrary(str);
        MethodCollector.o(14174);
    }
}
