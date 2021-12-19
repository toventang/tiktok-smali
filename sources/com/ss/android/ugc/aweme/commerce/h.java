package com.ss.android.ugc.aweme.commerce;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

public final class h implements Serializable {
    @c(a = "commerce_info")
    private final f commerceInfo;
    @c(a = "permissions")
    private final List<g> permissions;

    static {
        Covode.recordClassIndex(45198);
    }

    public final f getCommerceInfo() {
        return this.commerceInfo;
    }

    public final List<g> getPermissions() {
        return this.permissions;
    }

    public final boolean hasPermission(String str) {
        List<g> list;
        if (str != null && str.length() != 0 && (list = this.permissions) != null && !list.isEmpty()) {
            Iterator<T> it = this.permissions.iterator();
            while (true) {
                String str2 = null;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                T t = next;
                if (t != null) {
                    str2 = t.getKey();
                }
                if (TextUtils.equals(str, str2)) {
                    if (next != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
