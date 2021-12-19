package android.ss.com.vboost;

import com.bytedance.covode.number.Covode;

public enum d {
    COMMON_APP_START(100001, "common_app_start"),
    COMMON_CAMERA_START(100002, "common_camera_start"),
    COMMON_WINDOW_SWITCH(100003, "common_window_switch"),
    COMMON_TAB_SWITCH(100004, "common_tab_switch"),
    DY_GO_DUET(200001, "dy_go_duet"),
    DY_GO_REACTION(200002, "dy_go_reaction"),
    DY_TAB_LIVING_LOAD(200003, "dy_tab_living_load"),
    DY_TAB_NEARBY_LOAD(200004, "dy_tab_nearby_load"),
    DY_TAB_FOLLOW_LOAD(200005, "dy_tab_follow_load"),
    DY_TAB_SEARCH_LOAD(200006, "dy_tab_search_load"),
    DY_TAB_HOME_LOAD(200007, "dy_tab_home_load"),
    DY_TAB_FAMILIAR_LOAD(200008, "dy_tab_familiar_load"),
    DY_TAB_PUBLISH_LOAD(200009, "dy_tab_publish_load"),
    DY_TAB_NOTIFICATION_LOAD(200010, "dy_tab_notification_load"),
    DY_TAB_USER_LOAD(200011, "dy_tab_user_load"),
    DY_CONCURRENT_UPLOAD_COMPILE(200012, "dy_concurrent_upload_compile"),
    DY_FEED_SCROLL(200013, "dy_feed_scroll"),
    DY_COMMENT_LOAD(200014, "dy_comment_load"),
    DY_TAB_MUSIC(200015, "dy_tab_music"),
    DY_15S_CAPTURE_START(200016, "dy_15s_capture_start"),
    DY_LIVING_SCROLL(200017, "dy_living_scroll"),
    DY_LIVING_ENTER_GIFT_PANEL(200018, "dy_living_enter_gift_panel"),
    DY_LIVING_ENTER_GOODS_LIST(200019, "dy_living_enter_goods_list"),
    TO_FIRST_FRAME_DRAW(300001, "to_first_frame_draw"),
    TO_TAB_SWITCH(300002, "to_tab_switch"),
    TO_CLICK_NEWS(300003, "to_click_news"),
    TO_SCROLL_NEWS(300004, "to_scroll_news"),
    TO_VIDEO_FIRST_FRAME(300005, "to_video_first_frame"),
    TL_FIRST_FRAME_DRAW(400001, "tl_first_frame_draw"),
    TL_TAB_SWITCH(400002, "tl_tab_switch"),
    TL_CLICK_NEWS(400003, "tl_click_news"),
    TL_SCROLL_NEWS(400004, "tl_scroll_news"),
    DC_SCROLL_HOME(500001, "dc_scroll_home"),
    DC_TAB_SWITCH(500002, "dc_tab_switch"),
    DC_SCROLL_MOMENTS(500003, "dc_scroll_moments"),
    DC_VIDEO_FIRST_DRAW(500004, "dc_video_first_draw"),
    TT_GO_DUET(600001, "tt_go_duet"),
    TT_GO_REACTION(600002, "tt_go_reaction"),
    TT_TAB_LIVING_LOAD(600003, "tt_tab_living_load"),
    TT_TAB_NEARBY_LOAD(600004, "tt_tab_nearby_load"),
    TT_TAB_FOLLOW_LOAD(600005, "tt_tab_follow_load"),
    TT_TAB_SEARCH_LOAD(600006, "tt_tab_search_load"),
    TT_TAB_HOME_LOAD(600007, "tt_tab_home_load"),
    TT_TAB_FAMILIAR_LOAD(600008, "tt_tab_familiar_load"),
    TT_TAB_PUBLISH_LOAD(600009, "tt_tab_publish_load"),
    TT_TAB_NOTIFICATION_LOAD(600010, "tt_tab_notification_load"),
    TT_TAB_USER_LOAD(600011, "tt_tab_user_load"),
    TT_CONCURRENT_UPLOAD_COMPILE(600012, "tt_concurrent_upload_compile"),
    TT_FEED_SCROLL(600013, "tt_feed_scroll"),
    TT_COMMENT_LOAD(600014, "tt_comment_load"),
    TT_TAB_MUSIC(600015, "tt_tab_music"),
    TT_15S_CAPTURE_START(600016, "tt_15s_capture_start"),
    TT_LIVING_SCROLL(600017, "tt_living_scroll"),
    TT_LIVING_ENTER_GIFT_PANEL(600018, "tt_living_enter_gift_panel"),
    TT_LIVING_ENTER_GOODS_LIST(600019, "tt_living_enter_goods_list");
    
    public static final int MAX_CLASS;

    /* renamed from: a  reason: collision with root package name */
    private static final int f510a = COMMON_TAB_SWITCH.id;

    /* renamed from: b  reason: collision with root package name */
    private static final int f511b;

    /* renamed from: c  reason: collision with root package name */
    private static final int f512c;

    /* renamed from: d  reason: collision with root package name */
    private static final int f513d;

    /* renamed from: e  reason: collision with root package name */
    private static final int f514e;

    /* renamed from: f  reason: collision with root package name */
    private static final int f515f;

    /* renamed from: g  reason: collision with root package name */
    private static final int f516g;
    private String desc;
    private int id;

    public final String getDesc() {
        return this.desc;
    }

    public final int getId() {
        return this.id;
    }

    static {
        Covode.recordClassIndex(47);
        d dVar = DY_LIVING_ENTER_GOODS_LIST;
        d dVar2 = TO_VIDEO_FIRST_FRAME;
        d dVar3 = TL_SCROLL_NEWS;
        d dVar4 = DC_VIDEO_FIRST_DRAW;
        d dVar5 = TT_LIVING_ENTER_GOODS_LIST;
        f511b = dVar.id;
        f512c = dVar2.id;
        f513d = dVar3.id;
        f514e = dVar4.id;
        int i2 = dVar5.id;
        f515f = i2;
        f516g = i2;
        MAX_CLASS = i2 / 100000;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0041 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0011 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isValidId(int r5) {
        /*
            r4 = 100000(0x186a0, float:1.4013E-40)
            int r3 = r5 / r4
            int r5 = r5 % r4
            r2 = 1
            r1 = 0
            if (r3 <= 0) goto L_0x0011
            int r0 = android.ss.com.vboost.d.MAX_CLASS
            if (r3 > r0) goto L_0x0011
            switch(r3) {
                case 1: goto L_0x003a;
                case 2: goto L_0x0032;
                case 3: goto L_0x002a;
                case 4: goto L_0x0022;
                case 5: goto L_0x001a;
                case 6: goto L_0x0012;
                default: goto L_0x0011;
            }
        L_0x0011:
            return r1
        L_0x0012:
            if (r5 <= 0) goto L_0x0011
            int r0 = android.ss.com.vboost.d.f515f
            int r0 = r0 % r4
            if (r5 > r0) goto L_0x0011
            goto L_0x0041
        L_0x001a:
            if (r5 <= 0) goto L_0x0011
            int r0 = android.ss.com.vboost.d.f514e
            int r0 = r0 % r4
            if (r5 > r0) goto L_0x0011
            goto L_0x0041
        L_0x0022:
            if (r5 <= 0) goto L_0x0011
            int r0 = android.ss.com.vboost.d.f513d
            int r0 = r0 % r4
            if (r5 > r0) goto L_0x0011
            goto L_0x0041
        L_0x002a:
            if (r5 <= 0) goto L_0x0011
            int r0 = android.ss.com.vboost.d.f512c
            int r0 = r0 % r4
            if (r5 > r0) goto L_0x0011
            goto L_0x0041
        L_0x0032:
            if (r5 <= 0) goto L_0x0011
            int r0 = android.ss.com.vboost.d.f511b
            int r0 = r0 % r4
            if (r5 > r0) goto L_0x0011
            goto L_0x0041
        L_0x003a:
            if (r5 <= 0) goto L_0x0011
            int r0 = android.ss.com.vboost.d.f510a
            int r0 = r0 % r4
            if (r5 > r0) goto L_0x0011
        L_0x0041:
            return r2
            switch-data {1->0x003a, 2->0x0032, 3->0x002a, 4->0x0022, 5->0x001a, 6->0x0012, }
        */
        throw new UnsupportedOperationException("Method not decompiled: android.ss.com.vboost.d.isValidId(int):boolean");
    }

    private d(int i2, String str) {
        this.id = i2;
        this.desc = str;
    }
}
