package dmt.av.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.f;
import com.ss.android.ugc.tools.utils.i;
import h.f.b.l;

public abstract class a {

    /* renamed from: d  reason: collision with root package name */
    public static final C4140a f156690d = new C4140a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f156691a = -999;

    /* renamed from: b  reason: collision with root package name */
    public int f156692b = -999;

    /* renamed from: c  reason: collision with root package name */
    public final c f156693c;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f156694a;

        /* renamed from: b  reason: collision with root package name */
        public final EnumC4141a f156695b;

        /* renamed from: c  reason: collision with root package name */
        public final EnumC4141a f156696c;

        /* renamed from: d  reason: collision with root package name */
        public final EnumC4141a f156697d;

        /* renamed from: e  reason: collision with root package name */
        public final int f156698e;

        /* renamed from: f  reason: collision with root package name */
        public final String f156699f;

        static {
            Covode.recordClassIndex(104071);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return l.a(this.f156694a, bVar.f156694a) && l.a(this.f156695b, bVar.f156695b) && l.a(this.f156696c, bVar.f156696c) && l.a(this.f156697d, bVar.f156697d) && this.f156698e == bVar.f156698e && l.a(this.f156699f, bVar.f156699f);
        }

        public final int hashCode() {
            String str = this.f156694a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            EnumC4141a aVar = this.f156695b;
            int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
            EnumC4141a aVar2 = this.f156696c;
            int hashCode3 = (hashCode2 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
            EnumC4141a aVar3 = this.f156697d;
            int hashCode4 = (((hashCode3 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31) + this.f156698e) * 31;
            String str2 = this.f156699f;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode4 + i2;
        }

        public final String toString() {
            return "SeparatorReport(separatorTag=" + this.f156694a + ", originFileStatus=" + this.f156695b + ", recordFileStatus=" + this.f156696c + ", outputFileStatus=" + this.f156697d + ", checkResult=" + this.f156698e + ", extra=" + this.f156699f + ")";
        }

        /* renamed from: dmt.av.a.a$b$a  reason: collision with other inner class name */
        public enum EnumC4141a {
            EXIT("exit"),
            ABSENCE("miss"),
            NO_NEEDED("no needed");
            
            private final String status;

            public final String getStatus() {
                return this.status;
            }

            static {
                Covode.recordClassIndex(104072);
            }

            private EnumC4141a(String str) {
                this.status = str;
            }
        }

        public final String a() {
            return "Tag: " + this.f156694a + " \nOrigin File Exit: " + this.f156695b.getStatus() + " \nRecord File Exit: " + this.f156696c.getStatus() + " \nOutput File Exit: " + this.f156697d.getStatus() + " \nExtra: " + this.f156699f;
        }

        public /* synthetic */ b(String str, EnumC4141a aVar, EnumC4141a aVar2, EnumC4141a aVar3, int i2) {
            this(str, aVar, aVar2, aVar3, i2, "");
        }

        public b(String str, EnumC4141a aVar, EnumC4141a aVar2, EnumC4141a aVar3, int i2, String str2) {
            l.d(str, "");
            l.d(aVar, "");
            l.d(aVar2, "");
            l.d(aVar3, "");
            l.d(str2, "");
            this.f156694a = str;
            this.f156695b = aVar;
            this.f156696c = aVar2;
            this.f156697d = aVar3;
            this.f156698e = i2;
            this.f156699f = str2;
        }
    }

    static {
        Covode.recordClassIndex(104069);
    }

    public abstract b c(VideoPublishEditModel videoPublishEditModel);

    public abstract b d(VideoPublishEditModel videoPublishEditModel);

    /* renamed from: dmt.av.a.a$a  reason: collision with other inner class name */
    public static final class C4140a {
        static {
            Covode.recordClassIndex(104070);
        }

        private C4140a() {
        }

        public /* synthetic */ C4140a(byte b2) {
            this();
        }
    }

    public a(c cVar) {
        l.d(cVar, "");
        this.f156693c = cVar;
    }

    /* access modifiers changed from: protected */
    public void a(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        if (this.f156693c.f156704b.length() > 0 && !i.a(this.f156693c.f156704b)) {
            i.a(this.f156693c.f156704b, false);
        }
        if (this.f156693c.f156703a.length() > 0 && !i.a(this.f156693c.f156703a)) {
            i.a(this.f156693c.f156703a, false);
        }
    }

    public final b b(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        a(videoPublishEditModel);
        if (videoPublishEditModel.veAudioRecorderParam == null || !videoPublishEditModel.veAudioRecorderParam.hasRecord() || !f.a()) {
            return d(videoPublishEditModel);
        }
        return c(videoPublishEditModel);
    }
}
