package com.ss.android.ugc.effectmanager.effect.model;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.common.utils.CollectionUtil;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class ComposerHelper {
    private static List<String> serverURLs = new ArrayList();

    public static List<String> getServerUrls() {
        return serverURLs;
    }

    static {
        Covode.recordClassIndex(95396);
    }

    public static void setServerUrls(List<String> list) {
        serverURLs = list;
    }

    public static int versionCompare(String str, String str2) {
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int i2 = 0;
        while (i2 < split.length && i2 < split2.length && split[i2].equals(split2[i2])) {
            i2++;
        }
        if (i2 >= split.length || i2 >= split2.length) {
            return Integer.signum(split.length - split2.length);
        }
        return Integer.signum(Integer.valueOf(split[i2]).compareTo(Integer.valueOf(split2[i2])));
    }

    public static ComposerNode parseComposerMaterial(String str, String str2, String str3) {
        try {
            JSONArray jSONArray = new JSONObject(FileUtils.INSTANCE.getFileContent(str + File.separator + "config.json")).getJSONObject("effect").getJSONArray("Link");
            if (jSONArray.length() <= 0) {
                return null;
            }
            String string = jSONArray.getJSONObject(0).getString("path");
            if (!jSONArray.getJSONObject(0).getString(StringSet.type).toLowerCase().equals("composer")) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(FileUtils.INSTANCE.getFileContent(str + File.separator + string + "content.json"));
            ComposerNode composerNode = new ComposerNode();
            composerNode.tag_name = "root";
            composerNode.UI_name = "Composer";
            composerNode.type = 4;
            JSONObject jSONObject2 = jSONObject.getJSONObject("content");
            composerNode.children = new ArrayList();
            JSONArray jSONArray2 = jSONObject2.getJSONArray("nodes");
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                ComposerNode parseComposerNode = parseComposerNode(jSONArray2.getJSONObject(i2), str2, str3);
                if (parseComposerNode != null) {
                    parseComposerNode.parent = composerNode;
                }
                composerNode.children.add(parseComposerNode);
            }
            return composerNode;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static ComposerNode parseComposerNode(JSONObject jSONObject, String str, String str2) {
        try {
            ComposerNode composerNode = new ComposerNode();
            composerNode.type = jSONObject.getInt(StringSet.type);
            composerNode.file = jSONObject.optString("file", "");
            if (!CollectionUtil.isListEmpty(getServerUrls())) {
                composerNode.icon = getServerUrls().get(0) + jSONObject.optString("icon", null);
                composerNode.UI_name = jSONObject.optString("UI_name", null);
                composerNode.tag_name = jSONObject.getString("tag_name");
                composerNode.default_value = (float) jSONObject.optDouble("default_value", 0.0d);
                composerNode.min_value = (float) jSONObject.optDouble("min_value", 0.0d);
                composerNode.max_value = (float) jSONObject.optDouble("max_value", 0.0d);
                composerNode.switch_mode = jSONObject.optInt("switch_mode", 0);
                if (jSONObject.has("nodes")) {
                    composerNode.children = new ArrayList();
                    JSONArray jSONArray = jSONObject.getJSONArray("nodes");
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        ComposerNode parseComposerNode = parseComposerNode(jSONArray.getJSONObject(i2), str, str2);
                        if (parseComposerNode != null) {
                            parseComposerNode.parent = composerNode;
                            composerNode.children.add(parseComposerNode);
                        }
                    }
                    if (composerNode.children.size() == 0 || (composerNode.children.size() == 1 && composerNode.children.get(0).type == -1)) {
                        return null;
                    }
                } else {
                    List<String> serverUrls = getServerUrls();
                    ArrayList arrayList = new ArrayList();
                    Iterator<String> it = serverUrls.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next() + composerNode.file);
                    }
                    UrlModel urlModel = new UrlModel();
                    urlModel.setUrlList(arrayList);
                    urlModel.setUri(composerNode.file);
                    Effect effect = new Effect();
                    effect.setFileUrl(urlModel);
                    effect.setId(composerNode.file);
                    effect.setEffectId(composerNode.file);
                    effect.setZipPath(str2 + File.separator + effect.getId() + ".zip");
                    effect.setUnzipPath(str2 + File.separator + effect.getId());
                    composerNode.effect = effect;
                    JSONObject optJSONObject = jSONObject.optJSONObject("extra_info");
                    String str3 = "0";
                    if (optJSONObject != null) {
                        str3 = optJSONObject.optString("version", str3);
                    }
                    if (versionCompare(str, str3) < 0) {
                        return null;
                    }
                }
                return composerNode;
            }
            throw new IllegalArgumentException("serverURLs list is empty, call setServerUrls first.");
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
