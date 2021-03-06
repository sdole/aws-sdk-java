/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.opsworks.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import static com.amazonaws.util.StringUtils.COMMA_SEPARATOR;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * UpdateInstanceRequest Marshaller
 */
public class UpdateInstanceRequestMarshaller implements
        Marshaller<Request<UpdateInstanceRequest>, UpdateInstanceRequest> {

    public Request<UpdateInstanceRequest> marshall(
            UpdateInstanceRequest updateInstanceRequest) {

        if (updateInstanceRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<UpdateInstanceRequest> request = new DefaultRequest<UpdateInstanceRequest>(
                updateInstanceRequest, "AWSOpsWorks");
        request.addHeader("X-Amz-Target", "OpsWorks_20130218.UpdateInstance");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            StringWriter stringWriter = new StringWriter();
            JSONWriter jsonWriter = new JSONWriter(stringWriter);

            jsonWriter.object();

            if (updateInstanceRequest.getInstanceId() != null) {
                jsonWriter.key("InstanceId").value(
                        updateInstanceRequest.getInstanceId());
            }

            com.amazonaws.internal.SdkInternalList<String> layerIdsList = (com.amazonaws.internal.SdkInternalList<String>) updateInstanceRequest
                    .getLayerIds();
            if (!layerIdsList.isEmpty() || !layerIdsList.isAutoConstruct()) {
                jsonWriter.key("LayerIds");
                jsonWriter.array();
                for (String layerIdsListValue : layerIdsList) {
                    if (layerIdsListValue != null) {
                        jsonWriter.value(layerIdsListValue);
                    }
                }
                jsonWriter.endArray();
            }

            if (updateInstanceRequest.getInstanceType() != null) {
                jsonWriter.key("InstanceType").value(
                        updateInstanceRequest.getInstanceType());
            }

            if (updateInstanceRequest.getAutoScalingType() != null) {
                jsonWriter.key("AutoScalingType").value(
                        updateInstanceRequest.getAutoScalingType());
            }

            if (updateInstanceRequest.getHostname() != null) {
                jsonWriter.key("Hostname").value(
                        updateInstanceRequest.getHostname());
            }

            if (updateInstanceRequest.getOs() != null) {
                jsonWriter.key("Os").value(updateInstanceRequest.getOs());
            }

            if (updateInstanceRequest.getAmiId() != null) {
                jsonWriter.key("AmiId").value(updateInstanceRequest.getAmiId());
            }

            if (updateInstanceRequest.getSshKeyName() != null) {
                jsonWriter.key("SshKeyName").value(
                        updateInstanceRequest.getSshKeyName());
            }

            if (updateInstanceRequest.getArchitecture() != null) {
                jsonWriter.key("Architecture").value(
                        updateInstanceRequest.getArchitecture());
            }

            if (updateInstanceRequest.getInstallUpdatesOnBoot() != null) {
                jsonWriter.key("InstallUpdatesOnBoot").value(
                        updateInstanceRequest.getInstallUpdatesOnBoot());
            }

            if (updateInstanceRequest.getEbsOptimized() != null) {
                jsonWriter.key("EbsOptimized").value(
                        updateInstanceRequest.getEbsOptimized());
            }

            if (updateInstanceRequest.getAgentVersion() != null) {
                jsonWriter.key("AgentVersion").value(
                        updateInstanceRequest.getAgentVersion());
            }

            jsonWriter.endObject();

            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length",
                    Integer.toString(content.length));
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
