package com.ss.android.ugc.aweme.discover.k;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.a.c;
import java.io.Serializable;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f81400a = new a();

    /* renamed from: com.ss.android.ugc.aweme.discover.k.a$a  reason: collision with other inner class name */
    public static final class C1895a implements Serializable {
        public static final C1896a Companion = new C1896a((byte) 0);
        @c(a = "position")
        private int position = -1;
        @c(a = "user_note")
        private String userNote;

        static {
            Covode.recordClassIndex(50588);
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.k.a$a$a  reason: collision with other inner class name */
        public static final class C1896a {
            static {
                Covode.recordClassIndex(50589);
            }

            private C1896a() {
            }

            public /* synthetic */ C1896a(byte b2) {
                this();
            }
        }

        public final int getPosition() {
            return this.position;
        }

        public final String getUserNote() {
            return this.userNote;
        }

        public final void setPosition(int i2) {
            this.position = i2;
        }

        public final void setUserNote(String str) {
            this.userNote = str;
        }
    }

    private a() {
    }

    static {
        Covode.recordClassIndex(50587);
    }

    public static C1895a a() {
        try {
            return (C1895a) SettingsManager.a().a("music_user_note", C1895a.class);
        } catch (Throwable unused) {
            return null;
        }
    }
}
