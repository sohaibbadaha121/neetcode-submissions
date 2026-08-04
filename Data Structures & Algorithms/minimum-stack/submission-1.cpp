class MinStack {
    stack<int> realStack;
    stack<int> minStack;
public:
    MinStack() {
    }
    
    void push(int val) {
        realStack.push(val);
        val=min(val , minStack.empty() ? val : minStack.top());
        minStack.push(val);
    }
    
    void pop() {
        realStack.pop();
        minStack.pop();
    }
    
    int top() {
        return realStack.top();
    }
    
    int getMin() {
        return minStack.top();
    }
};
