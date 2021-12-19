package com.ss.android.ugc.aweme.filter.repository.internal.utils;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.effectplatform.a;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.repository.a.f;
import com.ss.android.ugc.aweme.filter.repository.a.g;
import com.ss.android.ugc.aweme.filter.repository.internal.d;
import com.ss.android.ugc.aweme.tools.ToolsUrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;
import h.m.p;
import h.q;
import h.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final d f95752a = new d("", "");

    static {
        Covode.recordClassIndex(60673);
    }

    public static final com.ss.android.ugc.aweme.filter.repository.a.d a(int i2) {
        return new com.ss.android.ugc.aweme.filter.repository.a.d(i2, g.FILTER_STATE_UNKNOWN, "", "");
    }

    private static int b(Effect effect) {
        l.d(effect, "");
        try {
            return Integer.parseInt(effect.getEffectId());
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final f b(FilterBean filterBean) {
        l.d(filterBean, "");
        return a(filterBean);
    }

    public static final f a(FilterBean filterBean) {
        l.d(filterBean, "");
        int id = filterBean.getId();
        String resId = filterBean.getResId();
        l.b(resId, "");
        String extra = filterBean.getExtra();
        String name = filterBean.getName();
        l.b(name, "");
        String enName = filterBean.getEnName();
        ToolsUrlModel resource = filterBean.getResource();
        List<String> tags = filterBean.getTags();
        l.b(tags, "");
        return new f(id, resId, name, enName, resource, tags, filterBean.getTagUpdateAt(), filterBean.getThumbnailFileUri(), extra);
    }

    public static final f a(Effect effect) {
        String str;
        Object obj;
        String str2;
        l.d(effect, "");
        int b2 = b(effect);
        String resourceId = effect.getResourceId();
        String extra = effect.getExtra();
        String name = effect.getName();
        l.d(effect, "");
        List<String> tags = effect.getTags();
        Uri uri = null;
        if (tags != null && !tags.isEmpty()) {
            Iterator<String> it = tags.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (p.b(next, "pinyin:", false)) {
                    Objects.requireNonNull(next, "null cannot be cast to non-null type java.lang.String");
                    str = next.substring(7);
                    l.b(str, "");
                    break;
                }
            }
        }
        str = null;
        UrlModel a2 = a.a(effect.getFileUrl());
        ToolsUrlModel toolsUrlModel = new ToolsUrlModel();
        toolsUrlModel.f138732a = a2.getUri();
        toolsUrlModel.f138733b = a2.getUrlList();
        List<String> tags2 = effect.getTags();
        if (tags2 == null) {
            tags2 = new ArrayList<>();
        }
        String tagsUpdatedAt = effect.getTagsUpdatedAt();
        try {
            List<String> urlList = effect.getIconUrl().getUrlList();
            if (urlList != null) {
                str2 = urlList.get(0);
            } else {
                str2 = null;
            }
            obj = q.m223constructorimpl(Uri.parse(str2));
        } catch (Throwable th) {
            obj = q.m223constructorimpl(r.a(th));
        }
        if (!q.m228isFailureimpl(obj)) {
            uri = obj;
        }
        return new f(b2, resourceId, name, str, toolsUrlModel, tags2, tagsUpdatedAt, uri, extra);
    }

    public static final com.ss.android.ugc.aweme.filter.repository.a.d a(FilterBean filterBean, g gVar) {
        l.d(filterBean, "");
        l.d(gVar, "");
        int id = filterBean.getId();
        String filterFilePath = filterBean.getFilterFilePath();
        l.b(filterFilePath, "");
        String filterFolder = filterBean.getFilterFolder();
        l.b(filterFolder, "");
        return new com.ss.android.ugc.aweme.filter.repository.a.d(id, gVar, filterFilePath, filterFolder);
    }

    public static final void a(com.ss.android.ugc.aweme.filter.repository.a.d dVar, FilterBean filterBean) {
        l.d(dVar, "");
        l.d(filterBean, "");
        filterBean.setFilterFilePath(dVar.f95546c);
        filterBean.setFilterFolder(dVar.f95547d);
    }
}
