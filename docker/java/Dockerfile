FROM openjdk:17-oracle

RUN microdnf install findutils && \
    microdnf install -y git

ARG GIT_USER_NAME
ARG GIT_USER_EMAIL

RUN git config --global user.name ${GIT_USER_NAME} && \
    git config --global user.email ${GIT_USER_EMAIL}

