package com.ss.android.ugc.aweme.notification.ab;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f113117a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(72728);
    }

    public static final boolean a() {
        try {
            NoticeCollapsibility noticeCollapsibility = (NoticeCollapsibility) SettingsManager.a().a("notice_collapsibility", NoticeCollapsibility.class);
            if (noticeCollapsibility == null || noticeCollapsibility.cutOffDays == 0 || noticeCollapsibility.extraNoticeCount == 0) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static final int b() {
        try {
            NoticeCollapsibility noticeCollapsibility = (NoticeCollapsibility) SettingsManager.a().a("notice_collapsibility", NoticeCollapsibility.class);
            if (noticeCollapsibility != null) {
                return noticeCollapsibility.cutOffDays;
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static final int c() {
        try {
            NoticeCollapsibility noticeCollapsibility = (NoticeCollapsibility) SettingsManager.a().a("notice_collapsibility", NoticeCollapsibility.class);
            if (noticeCollapsibility != null) {
                return noticeCollapsibility.extraNoticeCount;
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }
}
