package com.bytedance.librarian;

import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;

public class LibrarianUnsatisfiedLinkError extends UnsatisfiedLinkError {

    /* renamed from: a  reason: collision with root package name */
    private static final ArrayList<LibrarianUnsatisfiedLinkError> f39786a = new ArrayList<>();

    public static UnsatisfiedLinkError[] a() {
        UnsatisfiedLinkError[] unsatisfiedLinkErrorArr;
        MethodCollector.i(14266);
        ArrayList<LibrarianUnsatisfiedLinkError> arrayList = f39786a;
        synchronized (arrayList) {
            try {
                unsatisfiedLinkErrorArr = (UnsatisfiedLinkError[]) arrayList.toArray(new UnsatisfiedLinkError[0]);
            } finally {
                MethodCollector.o(14266);
            }
        }
        return unsatisfiedLinkErrorArr;
    }

    LibrarianUnsatisfiedLinkError(String str) {
        super(str);
        MethodCollector.i(14233);
        ArrayList<LibrarianUnsatisfiedLinkError> arrayList = f39786a;
        synchronized (arrayList) {
            try {
                arrayList.add(this);
            } finally {
                MethodCollector.o(14233);
            }
        }
    }

    LibrarianUnsatisfiedLinkError(String str, Throwable th) {
        super(str);
        MethodCollector.i(14265);
        initCause(th);
        ArrayList<LibrarianUnsatisfiedLinkError> arrayList = f39786a;
        synchronized (arrayList) {
            try {
                arrayList.add(this);
            } finally {
                MethodCollector.o(14265);
            }
        }
    }
}
