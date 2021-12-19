package com.ss.android.ugc.aweme.specact.popup.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;
import java.util.List;
import org.json.JSONObject;

public final class k extends BaseResponse {
    @com.google.gson.a.c(a = "data")

    /* renamed from: a  reason: collision with root package name */
    public c f134448a;

    public static final class b {
        @com.google.gson.a.c(a = "daily_read_time_count_auto")

        /* renamed from: a  reason: collision with root package name */
        public a f134451a;
        @com.google.gson.a.c(a = "required_time")

        /* renamed from: b  reason: collision with root package name */
        public int f134452b;

        static {
            Covode.recordClassIndex(87887);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return l.a(this.f134451a, bVar.f134451a) && this.f134452b == bVar.f134452b;
        }

        public final int hashCode() {
            a aVar = this.f134451a;
            return ((aVar != null ? aVar.hashCode() : 0) * 31) + this.f134452b;
        }

        public final String toString() {
            return "CollieExtra(autoCountTime=" + this.f134451a + ", requiredTime=" + this.f134452b + ")";
        }
    }

    public static final class j {
        @com.google.gson.a.c(a = "total")

        /* renamed from: a  reason: collision with root package name */
        public List<i> f134491a;

        static {
            Covode.recordClassIndex(87895);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof j) && l.a(this.f134491a, ((j) obj).f134491a);
            }
            return true;
        }

        public final int hashCode() {
            List<i> list = this.f134491a;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "TaskList(total=" + this.f134491a + ")";
        }
    }

    static {
        Covode.recordClassIndex(87885);
    }

    public static final class a {
        @com.google.gson.a.c(a = "is_auto")

        /* renamed from: a  reason: collision with root package name */
        public Boolean f134449a;
        @com.google.gson.a.c(a = "stop_auto_after_n_day_without_interaction")

        /* renamed from: b  reason: collision with root package name */
        public int f134450b;

        static {
            Covode.recordClassIndex(87886);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.f134449a, aVar.f134449a) && this.f134450b == aVar.f134450b;
        }

        public final int hashCode() {
            Boolean bool = this.f134449a;
            return ((bool != null ? bool.hashCode() : 0) * 31) + this.f134450b;
        }

        public final String toString() {
            return "AutoCountTime(isAuto=" + this.f134449a + ", nDays=" + this.f134450b + ")";
        }

        private /* synthetic */ a() {
            this(false);
        }

        private a(Boolean bool) {
            this.f134449a = bool;
            this.f134450b = 5;
        }
    }

    public static final class d {
        @com.google.gson.a.c(a = "content")

        /* renamed from: a  reason: collision with root package name */
        public String f134464a = null;
        @com.google.gson.a.c(a = "show_time_vv")

        /* renamed from: b  reason: collision with root package name */
        public int f134465b = 3;
        @com.google.gson.a.c(a = "total_times")

        /* renamed from: c  reason: collision with root package name */
        public int f134466c = 3;
        @com.google.gson.a.c(a = "show_interval")

        /* renamed from: d  reason: collision with root package name */
        public int f134467d = 2;

        static {
            Covode.recordClassIndex(87889);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return l.a(this.f134464a, dVar.f134464a) && this.f134465b == dVar.f134465b && this.f134466c == dVar.f134466c && this.f134467d == dVar.f134467d;
        }

        public final int hashCode() {
            String str = this.f134464a;
            return ((((((str != null ? str.hashCode() : 0) * 31) + this.f134465b) * 31) + this.f134466c) * 31) + this.f134467d;
        }

        public final String toString() {
            return "NewUserStaticBubble(content=" + this.f134464a + ", showTimeVv=" + this.f134465b + ", totalTimes=" + this.f134466c + ", showInterval=" + this.f134467d + ")";
        }

        private d() {
        }
    }

    public static final class f {
        @com.google.gson.a.c(a = "content")

        /* renamed from: a  reason: collision with root package name */
        public String f134473a = null;
        @com.google.gson.a.c(a = "show_time_vv")

        /* renamed from: b  reason: collision with root package name */
        public int f134474b = 3;
        @com.google.gson.a.c(a = "show_again_time_x")

        /* renamed from: c  reason: collision with root package name */
        public int f134475c = 3;
        @com.google.gson.a.c(a = "show_again_time_y")

        /* renamed from: d  reason: collision with root package name */
        public int f134476d = 10;

        static {
            Covode.recordClassIndex(87891);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return l.a(this.f134473a, fVar.f134473a) && this.f134474b == fVar.f134474b && this.f134475c == fVar.f134475c && this.f134476d == fVar.f134476d;
        }

        public final int hashCode() {
            String str = this.f134473a;
            return ((((((str != null ? str.hashCode() : 0) * 31) + this.f134474b) * 31) + this.f134475c) * 31) + this.f134476d;
        }

        public final String toString() {
            return "PendantClickTipBubble(content=" + this.f134473a + ", showTimeVv=" + this.f134474b + ", showAgainTimeX=" + this.f134475c + ", showAgainTimeY=" + this.f134476d + ")";
        }

        private f() {
        }
    }

    public static final class g {
        @com.google.gson.a.c(a = "bubble_id")

        /* renamed from: a  reason: collision with root package name */
        public String f134477a = null;
        @com.google.gson.a.c(a = "long_bubble_content")

        /* renamed from: b  reason: collision with root package name */
        public String f134478b = null;
        @com.google.gson.a.c(a = "show_time_vv")

        /* renamed from: c  reason: collision with root package name */
        public int f134479c = 3;
        @com.google.gson.a.c(a = "show_again_time")

        /* renamed from: d  reason: collision with root package name */
        public int f134480d = 3;

        static {
            Covode.recordClassIndex(87892);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return l.a(this.f134477a, gVar.f134477a) && l.a(this.f134478b, gVar.f134478b) && this.f134479c == gVar.f134479c && this.f134480d == gVar.f134480d;
        }

        public final int hashCode() {
            String str = this.f134477a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f134478b;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return ((((hashCode + i2) * 31) + this.f134479c) * 31) + this.f134480d;
        }

        public final String toString() {
            return "StaticPendantLongBubble(bubbleId=" + this.f134477a + ", longBubbleContent=" + this.f134478b + ", showTimeVv=" + this.f134479c + ", showAgainTime=" + this.f134480d + ")";
        }

        private g() {
        }
    }

    public static final class h {
        @com.google.gson.a.c(a = "content")

        /* renamed from: a  reason: collision with root package name */
        public String f134481a = null;
        @com.google.gson.a.c(a = "show_time_vv")

        /* renamed from: b  reason: collision with root package name */
        public int f134482b = 3;
        @com.google.gson.a.c(a = "show_again_time_x")

        /* renamed from: c  reason: collision with root package name */
        public int f134483c = 3;
        @com.google.gson.a.c(a = "show_again_time_y")

        /* renamed from: d  reason: collision with root package name */
        public int f134484d = 10;

        static {
            Covode.recordClassIndex(87893);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return l.a(this.f134481a, hVar.f134481a) && this.f134482b == hVar.f134482b && this.f134483c == hVar.f134483c && this.f134484d == hVar.f134484d;
        }

        public final int hashCode() {
            String str = this.f134481a;
            return ((((((str != null ? str.hashCode() : 0) * 31) + this.f134482b) * 31) + this.f134483c) * 31) + this.f134484d;
        }

        public final String toString() {
            return "TapRewardsTipBubble(content=" + this.f134481a + ", showTimeVv=" + this.f134482b + ", showAgainTimeX=" + this.f134483c + ", showAgainTimeY=" + this.f134484d + ")";
        }

        private h() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.a.k$k  reason: collision with other inner class name */
    public static final class C3494k {
        @com.google.gson.a.c(a = "content")

        /* renamed from: a  reason: collision with root package name */
        public String f134492a = null;
        @com.google.gson.a.c(a = "show_time_vv")

        /* renamed from: b  reason: collision with root package name */
        public int f134493b = 3;
        @com.google.gson.a.c(a = "total_times")

        /* renamed from: c  reason: collision with root package name */
        public int f134494c = 3;
        @com.google.gson.a.c(a = "show_interval")

        /* renamed from: d  reason: collision with root package name */
        public int f134495d = 2;

        static {
            Covode.recordClassIndex(87896);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3494k)) {
                return false;
            }
            C3494k kVar = (C3494k) obj;
            return l.a(this.f134492a, kVar.f134492a) && this.f134493b == kVar.f134493b && this.f134494c == kVar.f134494c && this.f134495d == kVar.f134495d;
        }

        public final int hashCode() {
            String str = this.f134492a;
            return ((((((str != null ? str.hashCode() : 0) * 31) + this.f134493b) * 31) + this.f134494c) * 31) + this.f134495d;
        }

        public final String toString() {
            return "VideoTaskPromptBubble(content=" + this.f134492a + ", showTimeVv=" + this.f134493b + ", totalTimes=" + this.f134494c + ", showInterval=" + this.f134495d + ")";
        }

        private C3494k() {
        }
    }

    public static final class e {
        @com.google.gson.a.c(a = "bubble_id")

        /* renamed from: a  reason: collision with root package name */
        public String f134468a = null;
        @com.google.gson.a.c(a = "long_bubble_content")

        /* renamed from: b  reason: collision with root package name */
        public String f134469b = null;
        @com.google.gson.a.c(a = "short_bubble_content")

        /* renamed from: c  reason: collision with root package name */
        public String f134470c = null;
        @com.google.gson.a.c(a = "show_time_vv")

        /* renamed from: d  reason: collision with root package name */
        public int f134471d = 5;
        @com.google.gson.a.c(a = "show_again_time")

        /* renamed from: e  reason: collision with root package name */
        public int f134472e = 3;

        static {
            Covode.recordClassIndex(87890);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return l.a(this.f134468a, eVar.f134468a) && l.a(this.f134469b, eVar.f134469b) && l.a(this.f134470c, eVar.f134470c) && this.f134471d == eVar.f134471d && this.f134472e == eVar.f134472e;
        }

        public final int hashCode() {
            String str = this.f134468a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f134469b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f134470c;
            if (str3 != null) {
                i2 = str3.hashCode();
            }
            return ((((hashCode2 + i2) * 31) + this.f134471d) * 31) + this.f134472e;
        }

        public final String toString() {
            return "PendantBubble(bubbleId=" + this.f134468a + ", longBubbleContent=" + this.f134469b + ", shortBubbleContent=" + this.f134470c + ", showTimeVv=" + this.f134471d + ", showAgainTime=" + this.f134472e + ")";
        }

        private e() {
        }
    }

    public static final class i {
        @com.google.gson.a.c(a = "app_id")

        /* renamed from: a  reason: collision with root package name */
        public long f134485a;
        @com.google.gson.a.c(a = "task_id")

        /* renamed from: b  reason: collision with root package name */
        public int f134486b;
        @com.google.gson.a.c(a = "key")

        /* renamed from: c  reason: collision with root package name */
        public String f134487c;
        @com.google.gson.a.c(a = "completed")

        /* renamed from: d  reason: collision with root package name */
        public Boolean f134488d;
        @com.google.gson.a.c(a = "conf_extra")

        /* renamed from: e  reason: collision with root package name */
        public String f134489e;
        @com.google.gson.a.c(a = "collie_extra")

        /* renamed from: f  reason: collision with root package name */
        public b f134490f;

        static {
            Covode.recordClassIndex(87894);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.f134485a == iVar.f134485a && this.f134486b == iVar.f134486b && l.a(this.f134487c, iVar.f134487c) && l.a(this.f134488d, iVar.f134488d) && l.a(this.f134489e, iVar.f134489e) && l.a(this.f134490f, iVar.f134490f);
        }

        public final String toString() {
            return "Task(appId=" + this.f134485a + ", taskId=" + this.f134486b + ", key=" + this.f134487c + ", completed=" + this.f134488d + ", extra=" + this.f134489e + ", collieExtra=" + this.f134490f + ")";
        }

        public final int a() {
            if (!TextUtils.isEmpty(this.f134489e)) {
                try {
                    return new JSONObject(this.f134489e).optInt("cold_down", 0);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            return 0;
        }

        public final int b() {
            if (!TextUtils.isEmpty(this.f134489e)) {
                try {
                    return new JSONObject(this.f134489e).optInt("read_and_like_video_time", 0);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            return 0;
        }

        public final int hashCode() {
            int i2;
            int i3;
            int i4;
            long j2 = this.f134485a;
            int i5 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + this.f134486b) * 31;
            String str = this.f134487c;
            int i6 = 0;
            if (str != null) {
                i2 = str.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = (i5 + i2) * 31;
            Boolean bool = this.f134488d;
            if (bool != null) {
                i3 = bool.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (i7 + i3) * 31;
            String str2 = this.f134489e;
            if (str2 != null) {
                i4 = str2.hashCode();
            } else {
                i4 = 0;
            }
            int i9 = (i8 + i4) * 31;
            b bVar = this.f134490f;
            if (bVar != null) {
                i6 = bVar.hashCode();
            }
            return i9 + i6;
        }
    }

    public static final class c {
        @com.google.gson.a.c(a = "task_list")

        /* renamed from: a  reason: collision with root package name */
        public j f134453a;
        @com.google.gson.a.c(a = "popup_list")

        /* renamed from: b  reason: collision with root package name */
        public List<i> f134454b;
        @com.google.gson.a.c(a = "popup_to_display")

        /* renamed from: c  reason: collision with root package name */
        public i f134455c;
        @com.google.gson.a.c(a = "pendant_bubble")

        /* renamed from: d  reason: collision with root package name */
        public e f134456d;
        @com.google.gson.a.c(a = "pendant_click_tip_bubble")

        /* renamed from: e  reason: collision with root package name */
        public f f134457e;
        @com.google.gson.a.c(a = "static_pendant_bubble")

        /* renamed from: f  reason: collision with root package name */
        public g f134458f;
        @com.google.gson.a.c(a = "last_activation_time")

        /* renamed from: g  reason: collision with root package name */
        public long f134459g;
        @com.google.gson.a.c(a = "lottie_name")

        /* renamed from: h  reason: collision with root package name */
        public String f134460h;
        @com.google.gson.a.c(a = "tap_to_rewards_bubble")

        /* renamed from: i  reason: collision with root package name */
        public h f134461i;
        @com.google.gson.a.c(a = "new_user_static_bubble")

        /* renamed from: j  reason: collision with root package name */
        public d f134462j;
        @com.google.gson.a.c(a = "video_task_prompt_bubble")

        /* renamed from: k  reason: collision with root package name */
        public C3494k f134463k;

        static {
            Covode.recordClassIndex(87888);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return l.a(this.f134453a, cVar.f134453a) && l.a(this.f134454b, cVar.f134454b) && l.a(this.f134455c, cVar.f134455c) && l.a(this.f134456d, cVar.f134456d) && l.a(this.f134457e, cVar.f134457e) && l.a(this.f134458f, cVar.f134458f) && this.f134459g == cVar.f134459g && l.a(this.f134460h, cVar.f134460h) && l.a(this.f134461i, cVar.f134461i) && l.a(this.f134462j, cVar.f134462j) && l.a(this.f134463k, cVar.f134463k);
        }

        public final String toString() {
            return "Data(taskList=" + this.f134453a + ", popupList=" + this.f134454b + ", popup=" + this.f134455c + ", pendantBubble=" + this.f134456d + ", pendantClickTipBubble=" + this.f134457e + ", staticPendantLongBubble=" + this.f134458f + ", lastActivationTime=" + this.f134459g + ", lottieName=" + this.f134460h + ", tapRewardsTipBubble=" + this.f134461i + ", newUserStaticBubble=" + this.f134462j + ", videoTaskPromptBubble=" + this.f134463k + ")";
        }

        public final int hashCode() {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            j jVar = this.f134453a;
            int i11 = 0;
            if (jVar != null) {
                i2 = jVar.hashCode();
            } else {
                i2 = 0;
            }
            int i12 = i2 * 31;
            List<i> list = this.f134454b;
            if (list != null) {
                i3 = list.hashCode();
            } else {
                i3 = 0;
            }
            int i13 = (i12 + i3) * 31;
            i iVar = this.f134455c;
            if (iVar != null) {
                i4 = iVar.hashCode();
            } else {
                i4 = 0;
            }
            int i14 = (i13 + i4) * 31;
            e eVar = this.f134456d;
            if (eVar != null) {
                i5 = eVar.hashCode();
            } else {
                i5 = 0;
            }
            int i15 = (i14 + i5) * 31;
            f fVar = this.f134457e;
            if (fVar != null) {
                i6 = fVar.hashCode();
            } else {
                i6 = 0;
            }
            int i16 = (i15 + i6) * 31;
            g gVar = this.f134458f;
            if (gVar != null) {
                i7 = gVar.hashCode();
            } else {
                i7 = 0;
            }
            long j2 = this.f134459g;
            int i17 = (((i16 + i7) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            String str = this.f134460h;
            if (str != null) {
                i8 = str.hashCode();
            } else {
                i8 = 0;
            }
            int i18 = (i17 + i8) * 31;
            h hVar = this.f134461i;
            if (hVar != null) {
                i9 = hVar.hashCode();
            } else {
                i9 = 0;
            }
            int i19 = (i18 + i9) * 31;
            d dVar = this.f134462j;
            if (dVar != null) {
                i10 = dVar.hashCode();
            } else {
                i10 = 0;
            }
            int i20 = (i19 + i10) * 31;
            C3494k kVar = this.f134463k;
            if (kVar != null) {
                i11 = kVar.hashCode();
            }
            return i20 + i11;
        }
    }
}
