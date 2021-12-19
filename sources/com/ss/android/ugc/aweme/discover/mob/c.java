package com.ss.android.ugc.aweme.discover.mob;

import com.bytedance.covode.number.Covode;

public interface c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f81879a = a.f81880a;

    public interface b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f81881a = a.f81882a;

        static {
            Covode.recordClassIndex(50844);
        }

        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            static final /* synthetic */ a f81882a = new a();

            public static String a(int i2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        return "video";
                    }
                    if (i2 == 0) {
                        return "user";
                    }
                    if (i2 == 1) {
                        return "music";
                    }
                    if (i2 == 2) {
                        return "challenge";
                    }
                    if (i2 == 7) {
                        return "live";
                    }
                }
                return "general";
            }

            private a() {
            }

            static {
                Covode.recordClassIndex(50845);
            }
        }
    }

    static {
        Covode.recordClassIndex(50842);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f81880a = new a();

        public static String a(int i2) {
            return i2 == 3 ? "general_search" : i2 == 4 ? "video" : i2 == 0 ? "user" : i2 == 1 ? "music" : i2 == 2 ? "challenge" : i2 == 7 ? "live" : "";
        }

        private a() {
        }

        static {
            Covode.recordClassIndex(50843);
        }
    }
}
