package com.bytedance.librarian.elf;

public interface Elf {

    public static abstract class DynamicStructure {

        /* renamed from: a  reason: collision with root package name */
        public long f39787a;

        /* renamed from: b  reason: collision with root package name */
        public long f39788b;
    }

    public static abstract class Header {

        /* renamed from: a  reason: collision with root package name */
        public boolean f39789a;

        /* renamed from: b  reason: collision with root package name */
        public int f39790b;

        /* renamed from: c  reason: collision with root package name */
        public long f39791c;

        /* renamed from: d  reason: collision with root package name */
        public long f39792d;

        /* renamed from: e  reason: collision with root package name */
        public int f39793e;

        /* renamed from: f  reason: collision with root package name */
        public int f39794f;

        /* renamed from: g  reason: collision with root package name */
        public int f39795g;

        /* renamed from: h  reason: collision with root package name */
        public int f39796h;

        /* renamed from: i  reason: collision with root package name */
        public int f39797i;

        public abstract DynamicStructure a(long j2, int i2);

        public abstract ProgramHeader a(long j2);

        public abstract SectionHeader a();
    }

    public static abstract class ProgramHeader {

        /* renamed from: a  reason: collision with root package name */
        public long f39798a;

        /* renamed from: b  reason: collision with root package name */
        public long f39799b;

        /* renamed from: c  reason: collision with root package name */
        public long f39800c;

        /* renamed from: d  reason: collision with root package name */
        public long f39801d;
    }

    public static abstract class SectionHeader {

        /* renamed from: a  reason: collision with root package name */
        public long f39802a;
    }
}
