package com.bytedance.assem.arch.viewModel;

import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.lang.reflect.InvocationTargetException;

public final class c implements ad.b {
    static {
        Covode.recordClassIndex(14971);
    }

    @Override // androidx.lifecycle.ad.b
    public final <T extends ac> T a(Class<T> cls) {
        l.c(cls, "");
        if (AssemViewModel.class.isAssignableFrom(cls)) {
            try {
                return cls.newInstance();
            } catch (NoSuchMethodException e2) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e3);
            } catch (InstantiationException e4) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e4);
            } catch (InvocationTargetException e5) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e5);
            }
        } else {
            throw new IllegalArgumentException("Custom ViewModel must be a subclass of LifeAwareViewModel.");
        }
    }
}
