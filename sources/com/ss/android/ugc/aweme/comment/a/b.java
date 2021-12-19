package com.ss.android.ugc.aweme.comment.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.m;
import h.h;
import h.i;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f71265a = {100, 100, 100};

    /* renamed from: b  reason: collision with root package name */
    public static final b f71266b = new b();

    /* renamed from: c  reason: collision with root package name */
    private static final h f71267c = i.a((h.f.a.a) a.f71268a);

    public static int[] a() {
        return (int[]) f71267c.getValue();
    }

    private b() {
    }

    static final class a extends m implements h.f.a.a<int[]> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f71268a = new a();

        static {
            Covode.recordClassIndex(43876);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ int[] invoke() {
            return a();
        }

        private static int[] a() {
            try {
                int[] iArr = (int[]) SettingsManager.a().a("comment_batch_max_limit", int[].class);
                if (iArr == null) {
                    return b.f71265a;
                }
                return iArr;
            } catch (Throwable unused) {
                return b.f71265a;
            }
        }
    }

    static {
        Covode.recordClassIndex(43875);
    }
}
