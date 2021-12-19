package com.bytedance.jedi.arch;

import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;

public final class t {
    static {
        Covode.recordClassIndex(24337);
    }

    static class a implements ad.b {
        static {
            Covode.recordClassIndex(24338);
        }

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        @Override // androidx.lifecycle.ad.b
        public final <T extends ac> T a(Class<T> cls) {
            try {
                T newInstance = cls.newInstance();
                if (newInstance instanceof JediViewModel) {
                    JediViewModel jediViewModel = (JediViewModel) newInstance;
                    y a2 = jediViewModel.f39365j.a(cls);
                    if (a2 != null) {
                        a2.binding(jediViewModel);
                    }
                    jediViewModel.a_(u.f39549a);
                }
                return newInstance;
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e3);
            }
        }
    }

    public static s a(e eVar) {
        if (eVar.getApplication() != null) {
            return new s(eVar.getViewModelStore(), new a((byte) 0));
        }
        throw new IllegalStateException("Your activity/fragment is not yet attached to Application. You can't request ViewModel before onCreate call.");
    }
}
