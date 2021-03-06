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
 * CreateStackRequest Marshaller
 */
public class CreateStackRequestMarshaller implements
        Marshaller<Request<CreateStackRequest>, CreateStackRequest> {

    public Request<CreateStackRequest> marshall(
            CreateStackRequest createStackRequest) {

        if (createStackRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<CreateStackRequest> request = new DefaultRequest<CreateStackRequest>(
                createStackRequest, "AWSOpsWorks");
        request.addHeader("X-Amz-Target", "OpsWorks_20130218.CreateStack");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            StringWriter stringWriter = new StringWriter();
            JSONWriter jsonWriter = new JSONWriter(stringWriter);

            jsonWriter.object();

            if (createStackRequest.getName() != null) {
                jsonWriter.key("Name").value(createStackRequest.getName());
            }

            if (createStackRequest.getRegion() != null) {
                jsonWriter.key("Region").value(createStackRequest.getRegion());
            }

            if (createStackRequest.getVpcId() != null) {
                jsonWriter.key("VpcId").value(createStackRequest.getVpcId());
            }

            com.amazonaws.internal.SdkInternalMap<String, String> attributesMap = (com.amazonaws.internal.SdkInternalMap<String, String>) createStackRequest
                    .getAttributes();
            if (!attributesMap.isEmpty() || !attributesMap.isAutoConstruct()) {
                jsonWriter.key("Attributes");
                jsonWriter.object();

                for (Map.Entry<String, String> attributesMapValue : attributesMap
                        .entrySet()) {
                    if (attributesMapValue.getValue() != null) {
                        jsonWriter.key(attributesMapValue.getKey());

                        jsonWriter.value(attributesMapValue.getValue());
                    }
                }
                jsonWriter.endObject();
            }

            if (createStackRequest.getServiceRoleArn() != null) {
                jsonWriter.key("ServiceRoleArn").value(
                        createStackRequest.getServiceRoleArn());
            }

            if (createStackRequest.getDefaultInstanceProfileArn() != null) {
                jsonWriter.key("DefaultInstanceProfileArn").value(
                        createStackRequest.getDefaultInstanceProfileArn());
            }

            if (createStackRequest.getDefaultOs() != null) {
                jsonWriter.key("DefaultOs").value(
                        createStackRequest.getDefaultOs());
            }

            if (createStackRequest.getHostnameTheme() != null) {
                jsonWriter.key("HostnameTheme").value(
                        createStackRequest.getHostnameTheme());
            }

            if (createStackRequest.getDefaultAvailabilityZone() != null) {
                jsonWriter.key("DefaultAvailabilityZone").value(
                        createStackRequest.getDefaultAvailabilityZone());
            }

            if (createStackRequest.getDefaultSubnetId() != null) {
                jsonWriter.key("DefaultSubnetId").value(
                        createStackRequest.getDefaultSubnetId());
            }

            if (createStackRequest.getCustomJson() != null) {
                jsonWriter.key("CustomJson").value(
                        createStackRequest.getCustomJson());
            }

            if (createStackRequest.getConfigurationManager() != null) {
                jsonWriter.key("ConfigurationManager");
                StackConfigurationManagerJsonMarshaller.getInstance().marshall(
                        createStackRequest.getConfigurationManager(),
                        jsonWriter);
            }

            if (createStackRequest.getChefConfiguration() != null) {
                jsonWriter.key("ChefConfiguration");
                ChefConfigurationJsonMarshaller.getInstance().marshall(
                        createStackRequest.getChefConfiguration(), jsonWriter);
            }

            if (createStackRequest.getUseCustomCookbooks() != null) {
                jsonWriter.key("UseCustomCookbooks").value(
                        createStackRequest.getUseCustomCookbooks());
            }

            if (createStackRequest.getUseOpsworksSecurityGroups() != null) {
                jsonWriter.key("UseOpsworksSecurityGroups").value(
                        createStackRequest.getUseOpsworksSecurityGroups());
            }

            if (createStackRequest.getCustomCookbooksSource() != null) {
                jsonWriter.key("CustomCookbooksSource");
                SourceJsonMarshaller.getInstance().marshall(
                        createStackRequest.getCustomCookbooksSource(),
                        jsonWriter);
            }

            if (createStackRequest.getDefaultSshKeyName() != null) {
                jsonWriter.key("DefaultSshKeyName").value(
                        createStackRequest.getDefaultSshKeyName());
            }

            if (createStackRequest.getDefaultRootDeviceType() != null) {
                jsonWriter.key("DefaultRootDeviceType").value(
                        createStackRequest.getDefaultRootDeviceType());
            }

            if (createStackRequest.getAgentVersion() != null) {
                jsonWriter.key("AgentVersion").value(
                        createStackRequest.getAgentVersion());
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
