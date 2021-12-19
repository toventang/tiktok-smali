package com.ss.android.ugc.aweme.tools.draft.ftc.util;

import com.bytedance.covode.number.Covode;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public final int f139671a;

    static {
        Covode.recordClassIndex(91315);
    }

    public static final class a extends e {

        /* renamed from: b  reason: collision with root package name */
        public final int f139672b;

        static {
            Covode.recordClassIndex(91316);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && this.f139672b == ((a) obj).f139672b;
            }
            return true;
        }

        public final int hashCode() {
            return this.f139672b;
        }

        public final String toString() {
            return "Delete(i=" + this.f139672b + ")";
        }

        public a(int i2) {
            super(i2, (byte) 0);
            this.f139672b = i2;
        }
    }

    public static final class b extends e {

        /* renamed from: b  reason: collision with root package name */
        public final int f139673b;

        static {
            Covode.recordClassIndex(91317);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && this.f139673b == ((b) obj).f139673b;
            }
            return true;
        }

        public final int hashCode() {
            return this.f139673b;
        }

        public final String toString() {
            return "Edit(i=" + this.f139673b + ")";
        }

        public b(int i2) {
            super(i2, (byte) 0);
            this.f139673b = i2;
        }
    }

    public static final class c extends e {

        /* renamed from: b  reason: collision with root package name */
        public final int f139674b;

        static {
            Covode.recordClassIndex(91318);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && this.f139674b == ((c) obj).f139674b;
            }
            return true;
        }

        public final int hashCode() {
            return this.f139674b;
        }

        public final String toString() {
            return "Save(i=" + this.f139674b + ")";
        }

        public c(int i2) {
            super(i2, (byte) 0);
            this.f139674b = i2;
        }
    }

    private e(int i2) {
        this.f139671a = i2;
    }

    public /* synthetic */ e(int i2, byte b2) {
        this(i2);
    }
}
