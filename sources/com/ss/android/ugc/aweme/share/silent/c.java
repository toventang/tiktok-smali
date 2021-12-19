package com.ss.android.ugc.aweme.share.silent;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.global.config.settings.pojo.ShareChannelSettings;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.share.improve.a;
import com.ss.android.ugc.aweme.sharer.b;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.a.z;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public enum c {
    INSTAGRAM("instagram", "Instagram", R.raw.icon_instagram, R.raw.icon_color_instagram_circle, 2),
    INSTAGRAM_STORY("instagram_story", "Instagram", R.raw.icon_instagram_story, R.raw.icon_color_instagram_story_circle, 3),
    WHATSAPP("whatsapp", "Whatsapp", R.raw.icon_whatsapp, R.raw.icon_color_whatsapp_circle, 5),
    FACEBOOK("facebook", "Facebook", R.raw.icon_facebook, R.raw.icon_color_facebook_circle, 6),
    SMS("sms", "Sms", R.raw.icon_messages, R.raw.icon_color_sms_circle, 13),
    MESSENGER("messenger", "Messenger", R.raw.icon_messenger, R.raw.icon_color_messenger_circle, 7),
    VK("vk", "VK", R.raw.icon_vk, R.raw.icon_color_vk_circle, 9),
    SNAPCHAT("snapchat", "Snapchat", R.raw.icon_snapchat, R.raw.icon_color_snapchat_circle, 8),
    LINE("line", "Line", R.raw.icon_line, R.raw.icon_color_line_circle, 11),
    ZALO("zalo", "Zalo", R.raw.icon_zalo, R.raw.icon_color_zalo_circle, 10),
    KAKAOTALK("kakaotalk", "KakaoTalk", R.raw.icon_kakaotalk, R.raw.icon_color_kakaotalk_circle, 12);
    
    public static final a Companion = new a((byte) 0);
    private final int checkedIconRes;
    private final String key;
    private final String label;
    private final int saveType;
    private final int uncheckedIconRes;

    public static final List<c> supportChannels(Activity activity) {
        return a.a(activity);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81635);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static List<c> a(Activity activity) {
            List list;
            Object obj;
            l.d(activity, "");
            if (!AVExternalServiceImpl.a().configService().avsettingsConfig().enableSaveUploadVideo()) {
                return z.INSTANCE;
            }
            List c2 = n.c(c.WHATSAPP, c.INSTAGRAM, c.INSTAGRAM_STORY, c.FACEBOOK, c.SMS, c.MESSENGER, c.VK, c.SNAPCHAT, c.LINE, c.ZALO, c.KAKAOTALK);
            try {
                IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
                l.b(iESSettingsProxy, "");
                List<ShareChannelSettings> silentShareList = iESSettingsProxy.getSilentShareList();
                list = new ArrayList();
                for (ShareChannelSettings shareChannelSettings : silentShareList) {
                    Iterator it = c2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        String key = ((c) obj).getKey();
                        l.b(shareChannelSettings, "");
                        if (l.a((Object) key, (Object) shareChannelSettings.getId())) {
                            break;
                        }
                    }
                    if (obj != null) {
                        list.add(obj);
                    }
                }
            } catch (com.bytedance.ies.a unused) {
                list = n.d((Iterable) c2, 4);
            }
            List<c> g2 = n.g((Collection) list);
            Iterator<c> it2 = g2.iterator();
            while (it2.hasNext()) {
                b a2 = a.C3201a.a(it2.next().getKey(), activity);
                if (a2 == null || !a2.b(activity)) {
                    it2.remove();
                }
            }
            return g2;
        }
    }

    public final int getCheckedIconRes() {
        return this.checkedIconRes;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getSaveType() {
        return this.saveType;
    }

    public final int getUncheckedIconRes() {
        return this.uncheckedIconRes;
    }

    static {
        Covode.recordClassIndex(81634);
    }

    private c(String str, String str2, int i2, int i3, int i4) {
        this.key = str;
        this.label = str2;
        this.uncheckedIconRes = i2;
        this.checkedIconRes = i3;
        this.saveType = i4;
    }
}
