package com.bytedance.im.core.d;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.utils.h;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public final class c implements Serializable {
    private String algorithm;
    private String displayType;
    private String encryptUrl;
    private Map<String, String> ext;
    private String hash;
    private int index;
    private long length;
    private String localPath;
    private String mimeType;
    private String msgUuid;
    private String remoteUrl;
    private String secretKey;
    private int status;
    private String type;
    private int uploadProgress;
    private Uri uploadUri;

    static {
        Covode.recordClassIndex(22750);
    }

    public final String getDisplayType() {
        return this.displayType;
    }

    public final Map<String, String> getExt() {
        return this.ext;
    }

    public final String getHash() {
        return this.hash;
    }

    public final int getIndex() {
        return this.index;
    }

    public final long getLength() {
        return this.length;
    }

    public final String getLocalPath() {
        return this.localPath;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getMsgUuid() {
        return this.msgUuid;
    }

    public final String getRemoteUrl() {
        return this.remoteUrl;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getType() {
        return this.type;
    }

    public final int getUploadProgress() {
        return this.uploadProgress;
    }

    public final Uri getUploadUri() {
        return this.uploadUri;
    }

    public final String getExtStr() {
        return h.a(this.ext);
    }

    public final String toString() {
        return h.f38770a.b(this);
    }

    public final Uri getLocalUri() {
        return Uri.fromFile(new File(this.localPath));
    }

    public final String getAlgorithm() {
        if (!TextUtils.isEmpty(this.algorithm)) {
            return this.algorithm;
        }
        String str = getExt().get("s:algorithm");
        this.algorithm = str;
        return str;
    }

    public final String getEncryptUrl() {
        if (!TextUtils.isEmpty(this.encryptUrl)) {
            return this.encryptUrl;
        }
        String str = getExt().get("s:encryptUrl");
        this.encryptUrl = str;
        return str;
    }

    public final String getSecretKey() {
        if (!TextUtils.isEmpty(this.secretKey)) {
            return this.secretKey;
        }
        String str = getExt().get("s:secretKey");
        this.secretKey = str;
        return str;
    }

    public final String getUri() {
        Map<String, String> map = this.ext;
        if (map == null || !map.containsKey("s:file_ext_key_uri")) {
            return "";
        }
        return this.ext.get("s:file_ext_key_uri");
    }

    public final String getVid() {
        Map<String, String> map = this.ext;
        if (map == null || !map.containsKey("s:file_ext_key_vid")) {
            return "";
        }
        return this.ext.get("s:file_ext_key_vid");
    }

    public final String getVideoCoverUrl() {
        Map<String, String> map = this.ext;
        if (map == null || !map.containsKey("s:file_ext_key_video_cover_url")) {
            return "";
        }
        return this.ext.get("s:file_ext_key_video_cover_url");
    }

    public final boolean isEncrypt() {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        return "1".equals(this.ext.get("s:file_ext_key_need_encrypt"));
    }

    public final boolean isUseImageX() {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        if (isEncrypt() || "1".equals(this.ext.get("s:file_ext_key_use_imagex"))) {
            return true;
        }
        return false;
    }

    public final void setDisplayType(String str) {
        this.displayType = str;
    }

    public final void setExt(Map<String, String> map) {
        updateExt(map);
    }

    public final void setHash(String str) {
        this.hash = str;
    }

    public final void setIndex(int i2) {
        this.index = i2;
    }

    public final void setLength(long j2) {
        this.length = j2;
    }

    public final void setLocalPath(String str) {
        this.localPath = str;
    }

    public final void setMimeType(String str) {
        this.mimeType = str;
    }

    public final void setMsgUuid(String str) {
        this.msgUuid = str;
    }

    public final void setRemoteUrl(String str) {
        this.remoteUrl = str;
    }

    public final void setStatus(int i2) {
        this.status = i2;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setUploadProgress(int i2) {
        this.uploadProgress = i2;
    }

    public final void setUploadUri(Uri uri) {
        this.uploadUri = uri;
    }

    public final void setExtStr(String str) {
        this.ext = h.a(str);
    }

    public final void setAlgorithm(String str) {
        this.algorithm = str;
        getExt().put("s:algorithm", str);
    }

    public final void setEncryptUrl(String str) {
        this.encryptUrl = str;
        getExt().put("s:encryptUrl", str);
    }

    public final void setLocalUri(Uri uri) {
        String str;
        if (uri != null) {
            str = uri.getPath();
        } else {
            str = "";
        }
        this.localPath = str;
    }

    public final void setSecretKey(String str) {
        this.secretKey = str;
        getExt().put("s:secretKey", str);
    }

    public final void setCoverUri(String str) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        if (!TextUtils.isEmpty(str)) {
            this.ext.put("s:file_ext_key_video_cover_uri", str);
        }
    }

    public final void setNeedEncrypt(boolean z) {
        String str;
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        Map<String, String> map = this.ext;
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        map.put("s:file_ext_key_need_encrypt", str);
    }

    public final void setUri(String str) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        if (!TextUtils.isEmpty(str)) {
            this.ext.put("s:file_ext_key_uri", str);
        }
    }

    public final void setUseImageX(boolean z) {
        String str;
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        Map<String, String> map = this.ext;
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        map.put("s:file_ext_key_use_imagex", str);
    }

    public final void setVid(String str) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        if (!TextUtils.isEmpty(str)) {
            this.ext.put("s:file_ext_key_vid", str);
        }
    }

    public final void updateExt(Map<String, String> map) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        if (map != null && !map.isEmpty()) {
            this.ext.putAll(map);
        }
    }

    public final void setEncryptUri(String str, String str2, String str3, String str4) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        if (!TextUtils.isEmpty(str)) {
            this.ext.put("s:file_ext_key_uri", str);
        }
        if (!TextUtils.isEmpty(str)) {
            this.ext.put("s:file_ext_key_encrypt_uri", str2);
        }
        this.secretKey = str3;
        this.algorithm = str4;
    }
}
