package com.ss.android.ugc.aweme.miniapp_api.model;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public final class a {
    static {
        Covode.recordClassIndex(70214);
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp_api.model.a$a  reason: collision with other inner class name */
    public static final class C2808a implements Serializable {
        private int id;
        private int mediaType;
        private String name;
        private String parentDir;
        private String path;
        private long size;
        private long time;

        static {
            Covode.recordClassIndex(70215);
        }

        public final int getId() {
            return this.id;
        }

        public final int getMediaType() {
            return this.mediaType;
        }

        public final String getName() {
            return this.name;
        }

        public final String getParentDir() {
            return this.parentDir;
        }

        public final String getPath() {
            return this.path;
        }

        public final long getSize() {
            return this.size;
        }

        public final long getTime() {
            return this.time;
        }

        public final void setId(int i2) {
            this.id = i2;
        }

        public final void setMediaType(int i2) {
            this.mediaType = i2;
        }

        public final void setName(String str) {
            this.name = str;
        }

        public final void setParentDir(String str) {
            this.parentDir = str;
        }

        public final void setPath(String str) {
            this.path = str;
        }

        public final void setSize(long j2) {
            this.size = j2;
        }

        public final void setTime(long j2) {
            this.time = j2;
        }

        public C2808a(String str, String str2, long j2, int i2, long j3, int i3, String str3) {
            this.path = str;
            this.name = str2;
            this.time = j2;
            this.mediaType = i2;
            this.size = j3;
            this.id = i3;
            this.parentDir = str3;
        }
    }
}
