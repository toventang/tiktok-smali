package com.bytedance.creativex.a.a;

import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import java.io.Serializable;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<? extends Object>[] f28028a = {Parcelable.class, Serializable.class, Byte.TYPE, Character.TYPE, Boolean.TYPE, Integer.TYPE, Short.TYPE, Long.TYPE, Float.TYPE, Double.TYPE, String.class};

    static {
        Covode.recordClassIndex(16412);
    }

    public static final class a extends m implements h.f.a.b<Class<?>, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f28029a = new a();

        static {
            Covode.recordClassIndex(16413);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Class<?> cls) {
            Class<?> cls2 = cls;
            l.d(cls2, "");
            Class<? extends Object>[] clsArr = b.f28028a;
            int length = clsArr.length;
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (clsArr[i2].isAssignableFrom(cls2)) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            return Boolean.valueOf(z);
        }
    }
}
