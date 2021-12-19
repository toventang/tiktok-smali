package com.ss.android.ugc.aweme.im.sdk.common.controller.e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.im.core.api.b.b;
import com.bytedance.im.core.a.e;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c;
import com.ss.android.ugc.aweme.im.sdk.relations.b.a;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private static f f102240a;

    static {
        Covode.recordClassIndex(65416);
    }

    private f() {
    }

    public static f a() {
        MethodCollector.i(5610);
        if (f102240a == null) {
            synchronized (f.class) {
                try {
                    if (f102240a == null) {
                        f102240a = new f();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5610);
                    throw th;
                }
            }
        }
        f fVar = f102240a;
        MethodCollector.o(5610);
        return fVar;
    }

    public static IMUser a(IMContact iMContact) {
        if (iMContact instanceof IMUser) {
            return (IMUser) iMContact;
        }
        if (iMContact instanceof IMConversation) {
            return a((IMConversation) iMContact);
        }
        return null;
    }

    private static IMUser a(IMConversation iMConversation) {
        if (iMConversation.getConversationType() == e.a.f37581a) {
            return g.a(String.valueOf(b.a.c(iMConversation.getConversationId())), c.a(iMConversation.getConversationId()));
        }
        return null;
    }

    private static boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str) || !str.toLowerCase().contains(str2)) {
            return false;
        }
        return true;
    }

    public final List<IMUser> a(List<IMUser> list, String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty() && !TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            int i2 = 0;
            while (true) {
                if (i2 >= str.length()) {
                    break;
                } else if (a.a(str.charAt(i2))) {
                    str = a.c(str).toLowerCase();
                    break;
                } else {
                    i2++;
                }
            }
            for (IMUser iMUser : list) {
                if ((z || iMUser.getType() == 0 || iMUser.getType() == 3) && !c.a(iMUser)) {
                    if (!TextUtils.isEmpty(iMUser.getUniqueId())) {
                        if (a(iMUser.getUniqueId(), lowerCase)) {
                            iMUser.setSearchType(1);
                            arrayList.add(iMUser);
                        }
                    } else if (a(iMUser.getShortId(), lowerCase)) {
                        iMUser.setSearchType(1);
                        arrayList.add(iMUser);
                    }
                    if (!TextUtils.isEmpty(iMUser.getRemarkName()) && a(iMUser.getRemarkName(), lowerCase)) {
                        iMUser.setSearchType(5);
                        arrayList.add(iMUser);
                    } else if (!TextUtils.isEmpty(iMUser.getContactName()) && (a(iMUser.getContactName(), lowerCase) || a(iMUser.getContactName(), iMUser.getContactNamePinyin(), lowerCase, str))) {
                        iMUser.setSearchType(2);
                        arrayList.add(iMUser);
                    } else if (!TextUtils.isEmpty(iMUser.getNickName()) && a(iMUser.getNickName(), lowerCase)) {
                        iMUser.setSearchType(3);
                        arrayList.add(iMUser);
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList, new Comparator<IMUser>() {
                /* class com.ss.android.ugc.aweme.im.sdk.common.controller.e.f.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(65417);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // java.util.Comparator
                public final /* synthetic */ int compare(IMUser iMUser, IMUser iMUser2) {
                    IMUser iMUser3 = iMUser;
                    IMUser iMUser4 = iMUser2;
                    if (iMUser3 == null) {
                        if (iMUser4 == null) {
                            return 0;
                        }
                        return -1;
                    } else if (iMUser4 == null) {
                        return 1;
                    } else {
                        return Integer.compare(iMUser3.getSearchType(), iMUser4.getSearchType());
                    }
                }
            });
        }
        return arrayList;
    }

    private static boolean a(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str4)) {
            if (str2.contains(str3)) {
                return true;
            }
            if (str2.contains(str4)) {
                int i2 = 0;
                int i3 = 0;
                for (char c2 : str3.toCharArray()) {
                    if (a.a(c2)) {
                        if (i2 > i3 && !str.contains(str3.substring(i3, i2))) {
                            return false;
                        }
                        i2++;
                        i3 = i2;
                    } else if (i2 != str3.length() - 1) {
                        i2++;
                    } else if (!str.contains(str3.substring(i3, i2 + 1))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
