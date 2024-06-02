# PostgreSQL Deployment using Kubernetes StatefulSets

## Steps to Apply the Configuration

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
