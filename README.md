# PostgreSQL Deployment using Kubernetes StatefulSets

## Steps to Apply the Configuration for postgress

### 1. Create ConfigMap for Database Configuration

Refer to file `configmap.yaml`
Apply the ConfigMap:

```sh
kubectl apply -f configmap.yaml
```

### 2. Create Secret for Database Password

Refer to file `secret.yaml`
Apply the Secret:

```sh
kubectl apply -f secret.yaml
```

### 3. Create PersistentVolume and PersistentVolumeClaim for Data Persistence

Refer to file `pv-pvc.yaml`
Apply the PersistentVolume and PersistentVolumeClaim:

```sh
kubectl apply -f pv-pvc.yaml
```

### 4. Create StatefulSet for PostgreSQL

Refer to file `statefulset.yaml`
Apply the StatefulSet:

```sh
kubectl apply -f statefulset.yaml
```

### 5. Create a Headless Service to Expose the StatefulSet

Refer to file `service.yaml`
Apply the Service:

```sh
kubectl apply -f service.yaml
```

## Steps to Apply the Configuration for API

### 1. Create ConfigMap for api Configuration

Refer to file `api-config.yaml`
Apply the ConfigMap:

```sh
kubectl apply -f api-config.yaml
```

### 2. Create Secret for API Password

Refer to file `api-secret.yaml`
Apply the Secret:

```sh
kubectl apply -f api-secret.yaml
```

### 3. Create a ReplicaSet for the API Service

Refer to file `api-replicaset.yaml`
Apply the ReplicaSet for the API Service:

```sh
kubectl apply -f api-replicaset.yaml
```

### 4. Create a Service to Expose the API

Refer to file `api-service.yaml`
Apply the ervice to Expose the API:

```sh
kubectl apply -f api-service.yaml
```

### 5. Create an HPA for the API Service

Refer to file `api-hpa.yaml`
Apply the HPA for the API Service:

```sh
kubectl apply -f api-hpa.yaml
```

### Docker hub image url

https://hub.docker.com/layers/uttambhagaur/employee-rest/1.0/images/sha256-b753a2769ed9103a0d2dd104085dcf774871c360ae7afa5d154282d627f01941?context=explore
